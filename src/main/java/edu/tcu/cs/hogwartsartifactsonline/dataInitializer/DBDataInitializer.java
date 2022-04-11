package edu.tcu.cs.hogwartsartifactsonline.dataInitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactsonline.dao.WizardDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;
    private WizardDao wizardDao;

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

        Wizard w1 = new Wizard();
        w1.setName("Dumbledore");
        w1.addArtifact(a1);
        w1.addArtifact(a3);

        Wizard w2 = new Wizard();
        w2.setName("Harry");
        w2.addArtifact(a2);
        w2.addArtifact(a4);

        Wizard w3 = new Wizard();
        w3.setName("Neville");
        w3.addArtifact(a5);

        wizardDao.save(w1);
        wizardDao.save(w2);
        wizardDao.save(w3);
        artifactDao.save(a6);
    }
}
