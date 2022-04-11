package edu.tcu.cs.hogwartsartifactsonline.dataInitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;

    public DBDataInitializer(ArtifactDao artifactDao) {
        this.artifactDao = artifactDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Artifact a1 = new Artifact();
        a1.setId("1");
        a1.setName("Deluminator");
        a1.setDescription("Yada Yada Deluminator");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("2");
        a2.setName("Wand");
        a2.setDescription("Yada Yada Deluminator");
        a2.setImageUrl("imageUrl");

        Artifact a3 = new Artifact();
        a3.setId("3");
        a3.setName("Holder");
        a3.setDescription("Yada Yada Deluminator");
        a3.setImageUrl("imageUrl");

        Artifact a4 = new Artifact();
        a4.setId("4");
        a4.setName("Potion");
        a4.setDescription("Yada Yada Deluminator");
        a4.setImageUrl("imageUrl");

        Artifact a5 = new Artifact();
        a5.setId("5");
        a5.setName("Sword");
        a5.setDescription("Yada Yada Deluminator");
        a5.setImageUrl("imageUrl");

        Artifact a6 = new Artifact();
        a6.setId("6");
        a6.setName("Random items...");
        a6.setDescription("Yada Yada Deluminator");
        a6.setImageUrl("imageUrl");

        artifactDao.save(a1);
        artifactDao.save(a2);
        artifactDao.save(a3);
        artifactDao.save(a4);
        artifactDao.save(a5);
        artifactDao.save(a6);
    }
}
