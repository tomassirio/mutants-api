package com.tomassirio.mutants.MutantsAPI.test;

import com.tomassirio.mutants.MutantsAPI.MutantsApiApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MutantsApiApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MutantTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @LocalServerPort
    private int port;
    private String getRootUrl() {
        return "http://localhost:" + port;
    }
    @Test
    public void contextLoads() {
    }
//    @Test
//    public void testCreateUser() {
//        User user = new User();
//        user.setEmail("admin@gmail.com");
//        user.setFirstName("admin");
//        user.setLastName("admin");
//        user.setCreatedBy("admin");
//        user.setUpdatedBy("admin");
//        ResponseEntity<User> postResponse = restTemplate.postForEntity(getRootUrl() + "/users", user, User.class);
//        Assert.assertNotNull(postResponse);
//        Assert.assertNotNull(postResponse.getBody());
//    }
//    @Test
//    public void testUpdatePost() {
//        int id = 1;
//        User user = restTemplate.getForObject(getRootUrl() + "/users/" + id, User.class);
//        user.setFirstName("admin1");
//        user.setLastName("admin2");
//        restTemplate.put(getRootUrl() + "/users/" + id, user);
//        User updatedUser = restTemplate.getForObject(getRootUrl() + "/users/" + id, User.class);
//        Assert.assertNotNull(updatedUser);
//    }
//    @Test
//    public void testDeletePost() {
//        int id = 2;
//        User user = restTemplate.getForObject(getRootUrl() + "/users/" + id, User.class);
//        Assert.assertNotNull(user);
//        restTemplate.delete(getRootUrl() + "/users/" + id);
//        try {
//            user = restTemplate.getForObject(getRootUrl() + "/users/" + id, User.class);
//        } catch (final HttpClientErrorException e) {
//            Assert.assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
//        }
//    }
}