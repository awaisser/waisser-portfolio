public class ArgumentPyramid {
    /* 1. Identify and fix all the errors in the following code...
     Class names like "welcome" should start with an uppercase. --> Welcome
     The word void is missing after "public static" --> public static void
     Method names like "Main" should start with a lowercase. --> main
     "string" starts with an uppercase --> String
     "Int" should start with a lowercase --> int
     "HALF" should be a lowercase --> half
     Take out "a*half" from quotes --> a*half
    2. Check syntax of following arguments:
    Incorrect
    Incorrect
    Correct
    Incorrect
    Correct
    Correct
    3. Which of the identifiers are valid? Which are Java keywords?
    Valid: miles, Tests, $4, apps, x, y, radius
    Keywords: class, public, int
     */
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1] + args[1]);
        System.out.println(args[2] + args[2] +args[2]);
    }
    }
