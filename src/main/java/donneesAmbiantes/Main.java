package donneesAmbiantes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class Main {

	public static void main(String[] args) throws JsonSyntaxException, IOException {

		File file = new File("src/main/resources/source.txt");
		ArrayList<Data> list = new ArrayList<Data>();

		remplirListe(file, list);
		genererRapportAll(list);

		Collections.sort(list);
		genererRapportFiveBest(list);
		genererRapportFiveWorst(list);
		genererStats(list);
	}

	public static void remplirListe(File f, ArrayList<Data> list) throws JsonSyntaxException, IOException {

		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		Gson gson = new Gson();
		while ((line = br.readLine()) != null) {
			if (!line.startsWith("##")) {

				list.add(gson.fromJson(line, Data.class));
				// System.out.println(list.get(0).toString());
			}
		}
		br.close();
	}

	public static void genererRapportAll(ArrayList<Data> list) throws IOException {

		String aEcrire = "";
		aEcrire += "<h1> List of visited places</h1>\n";
		aEcrire += "<ul>\n";

		for (int i = 0; i < list.size(); i++) {
			aEcrire += "<li>" + list.get(i).getCrowdSourcedValue().getComment() + " ("
					+ nombreEtoile(list.get(i).getCrowdSourcedValue().getInterest()) + ") \n <ul> <li>Latitude : "
					+ list.get(i).getCrowdSourcedLocation().getLatitude() + "</li> <li> \n Longitude : "
					+ list.get(i).getCrowdSourcedLocation().getLongitude() + "</li> </ul> </li>\n";
		}
		aEcrire += "</ul>";

		File file = new File("src/main/resources/allData.html");
		BufferedWriter wr = new BufferedWriter(new FileWriter(file));

		wr.write(aEcrire);
		wr.close();

	}

	public static void genererRapportFiveWorst(ArrayList<Data> list) throws IOException {

		String aEcrire = "";
		aEcrire += "<h1> List of worst visited places</h1>\n";
		aEcrire += "<ul>\n";

		for (int i = 0; i < list.size() && i < 5; i++) {
			aEcrire += "<li>" + list.get(i).getCrowdSourcedValue().getComment() + " ("
					+ nombreEtoile(list.get(i).getCrowdSourcedValue().getInterest()) + ") \n <ul> <li>Latitude : "
					+ list.get(i).getCrowdSourcedLocation().getLatitude() + "</li> <li> \n Longitude : "
					+ list.get(i).getCrowdSourcedLocation().getLongitude() + "</li> </ul> </li>\n";
		}
		aEcrire += "</ul>";

		File file = new File("src/main/resources/FiveWorst.html");
		BufferedWriter wr = new BufferedWriter(new FileWriter(file));

		wr.write(aEcrire);
		wr.close();

	}

	public static void genererRapportFiveBest(ArrayList<Data> list) throws IOException {

		String aEcrire = "";
		aEcrire += "<h1> List of best visited places</h1>\n";
		aEcrire += "<ul>\n";

		for (int i = list.size() - 1; i >= list.size() - 5 && i >= 0; i--) {
			aEcrire += "<li>" + list.get(i).getCrowdSourcedValue().getComment() + " ("
					+ nombreEtoile(list.get(i).getCrowdSourcedValue().getInterest()) + ") \n <ul> <li>Latitude : "
					+ list.get(i).getCrowdSourcedLocation().getLatitude() + "</li> <li> \n Longitude : "
					+ list.get(i).getCrowdSourcedLocation().getLongitude() + "</li> </ul> </li>\n";
		}
		aEcrire += "</ul>";

		File file = new File("src/main/resources/FiveBest.html");
		BufferedWriter wr = new BufferedWriter(new FileWriter(file));

		wr.write(aEcrire);
		wr.close();

	}

	public static void genererStats(ArrayList<Data> list) throws IOException {

		int nbEntrees = list.size();
		int best = list.get(list.size() - 1).getCrowdSourcedValue().getInterest();
		int worst = list.get(0).getCrowdSourcedValue().getInterest();
		int avg = 0;
		int nbBest = 0;
		int nbWorst = 0;
		int temp = 0;

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i).getCrowdSourcedValue().getInterest();
			avg += temp;
			if (temp == worst)
				nbWorst++;
			else if (temp == best)
				nbBest++;
		}
		if (nbEntrees > 0)
			avg /= nbEntrees;

		String aEcrire = "<table>\n <tr>\n <th>Stat</th>\n <th>Value</th>\n</tr>";
		aEcrire += "<tr>\n<td>Number of entries</td>\n <td>" + nbEntrees + "</td>\n</tr>";
		aEcrire += "<tr>\n<td>Best Interest</td>\n <td>" + best + "</td>\n</tr>";
		aEcrire += "<tr>\n<td>Worst Interest</td>\n <td>" + worst + "</td>\n</tr>";
		aEcrire += "<tr>\n<td>Average of interest</td>\n <td>" + avg + "</td>\n</tr>";
		aEcrire += "<tr>\n<td>Number of best score</td>\n <td>" + nbBest + "</td>\n</tr>";
		aEcrire += "<tr>\n<td>Number of worst score</td>\n <td>" + nbWorst + "</td>\n</tr>";
		aEcrire += "</table>";

		File file = new File("src/main/resources/Stats.html");
		BufferedWriter wr = new BufferedWriter(new FileWriter(file));

		wr.write(aEcrire);
		wr.close();

	}

	public static String nombreEtoile(int star) {

		String str = "";
		for (int i = 0; i < star; i++) {
			str += "*";
		}
		return str;
	}
}
