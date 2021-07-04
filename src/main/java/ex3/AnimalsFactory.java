package ex3;

/**
 *  animals factory
 *
 */
public class AnimalsFactory {
    public AnimalsFactory() {
    }

    private static class AnimalsFoctoryHolder {
        private static AnimalsFactory single;

        static {
            single = new AnimalsFactory();
        }
    }

    public static AnimalsFactory getSingle() {

        return AnimalsFoctoryHolder.single;
    }

    public AnimalsType getType(EnumAnimalsType type) {
        switch (type) {
            case HERBIVORE:
                return new SavaneAfricaine();
            case CARNIVORE:
                return new ZoneCarnivore();
            case REPTILE:
                return new FermeReptile();
            case POISSON:
                return new Aquarium();
            default:
                return null;
        }
    }
}
