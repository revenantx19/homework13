public class Main {
    public static void main(String[] args) {

        Author joanRowling = new Author("Joan", "Rowling");
        Author antuanDeSent = new Author("Antuan de sent", "Exupery");
        Book harryPotter = new Book("Harry Potter", 1997, "women");
        Book littlePrince = new Book("Little Prince", 1943, "men");

        System.out.print(joanRowling.getFirstName() + " ");
        System.out.println(joanRowling.getLastName());

        System.out.println(harryPotter.getNameOfBook());
        System.out.println(harryPotter.getPublicAge());
        System.out.println(harryPotter.setPublicAge(1895));
        System.out.println(harryPotter.getAuthorType());

        System.out.print(antuanDeSent.getFirstName() + " ");
        System.out.println(antuanDeSent.getLastName());

        System.out.println(littlePrince.getNameOfBook());
        System.out.println(littlePrince.getPublicAge());
        System.out.println(littlePrince.setPublicAge(1800));
        System.out.println(littlePrince.getAuthorType());
        //task2
        System.out.println(joanRowling);
        System.out.println(harryPotter);

        System.out.println(antuanDeSent);
        System.out.println(littlePrince);
    }
}