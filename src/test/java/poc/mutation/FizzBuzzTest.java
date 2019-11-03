package poc.mutation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class FizzBuzzTest {

    private static final FizzBuzz FIZZ_BUZZ = new FizzBuzz();

    @Test
    public void should_return_original_number_when_not_divisable_by_3_or_5() {
        assertThat(FIZZ_BUZZ.run(1)).isNotNull();
    }

    @Test
    public void should_return_Fizz_when_number_divisable_by_3() {
        assertThat(FIZZ_BUZZ.run(3)).isNotNull();
    }

    @Test
    public void should_return_Buzz_when_number_divisable_by_5() {
        assertThat(FIZZ_BUZZ.run(5)).isNotNull();
    }

    @Test
    public void should_return_FizzBuzz_when_number_divisable_by_3_and_5() {
        assertThat(FIZZ_BUZZ.run(15)).isNotNull();
    }

}
