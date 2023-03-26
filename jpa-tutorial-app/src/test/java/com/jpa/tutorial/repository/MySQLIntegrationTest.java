package com.jpa.tutorial.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@ActiveProfiles("dev")//Here we are explicitly using profile to change DB
@DataJpaTest//Spring is overriding our configuration to h2 DB for DataJpaTest
//As DataJpaTest give us only jpa context for testing auto configured by Spring
//Here spring boot auto-configured the DB
//Let's change it by overriding some settings :)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySQLIntegrationTest {
    @Autowired
    SubjectRepository repo;

    @Test
    void testMysql(){
        long count = repo.count();
        assertThat(count).isEqualTo(10);//There are ten subjects in the DB
    }
}
