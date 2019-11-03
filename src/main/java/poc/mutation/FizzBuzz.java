package poc.mutation;

public class FizzBuzz {

    public String run(Integer value) {
        StringBuilder sb = new StringBuilder();
        if (value % 3 == 0) {
            sb.append("Fizz");
        }
        if (value % 5 == 0) {
            sb.append("Buzz");
        }
        if (sb.length() == 0) {
            sb.append(value);
        }
        return sb.toString();
    }

}
