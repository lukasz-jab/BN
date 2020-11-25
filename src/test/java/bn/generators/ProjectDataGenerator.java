package bn.generators;

import bn.model.Affiliation;
import bn.model.ProjectData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectDataGenerator {

    public static void main(String[] args) throws IOException {

        int i = 1;
        File file = new File("src/test/resources/projects.json");

        List<ProjectData> projects = generateProjectData(i);
        saveAsJson(projects, file);
    }

    private static List<ProjectData> generateProjectData(int i) {
        List<ProjectData> projects = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            projects.add(new ProjectData().withTitle("Tytuł").withStartDate("2020-11-23").withEndDate("2020-11-23")
                    .withDescription("Opis").withAffiliation(new Affiliation().withId("1").withName("new Affiliation"))
                    .withKeywords(Arrays.asList("słowo klucz 1", "słowo klucz 2")).withInvites(Arrays.asList("zaproszenie 1", "zaproszenie 2"))
                    .withInviteMessage("wiadomość zaproszenia").withProjectid("projekt nr 1"));
        }
        return projects;
    }

    private static void saveAsJson(List<ProjectData> projects, File file) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(projects);

        Writer writer = new FileWriter(file);
        writer.write(json);
        writer.close();

    }

}
