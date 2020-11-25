package bn.tests;

import bn.model.ProjectData;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RestAssuredTest {


    @DataProvider
    public Iterator<Object[]> jsonFromFile() throws IOException {
        List<Object[]> list = new ArrayList<Object[]>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/projects.json")));
        String json = "";
        String line = reader.readLine();
        while (line != null) {
            json = json + line;
            line = reader.readLine();
        }
        Gson gson = new Gson();
        List<ProjectData> projects = gson.fromJson(json, new TypeToken<List<ProjectData>>() {
        }.getType());
        return projects.stream().map((o -> new Object[]{o})).collect(Collectors.toList()).iterator();
    }

    @Test(dataProvider = "jsonFromFile")
    public void testResstAssuredPost(ProjectData projectData) {

        String json = RestAssured.given()
                .parameter("title", projectData.getTitle())
                .parameter("startDate", projectData.getStartDate())
                .parameter("endDate", projectData.getEndDate())
                .parameter("description", projectData.getDescription())
                .parameter("affiliation", projectData.getAffiliation())
                .parameter("keywords", projectData.getKeywords())
                .parameter("invites", projectData.getInvites())
                .parameter("inviteMessage", projectData.getInviteMessage())
                .parameter("projectid", projectData.getProjectid())
                .post("http://dummy.restapiexample.com/api/v1/create").asString();

    }
}
