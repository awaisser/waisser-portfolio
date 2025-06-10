public class StudentCS170 extends Student {

    private String concepts;


    public StudentCS170(String n, int id, int year, String concepts) {

        this.concepts = concepts;

        System.out.println("A student from cs 170 created knows interface?" + this.knowInterface());
    }


    @Override

    public char knowInterface() {

        if (concepts.contains(concept))

            return 'Y';

        else if (!concepts.contains(concept))

            return 'N';

        return 'U';   //unknown

    }

}
