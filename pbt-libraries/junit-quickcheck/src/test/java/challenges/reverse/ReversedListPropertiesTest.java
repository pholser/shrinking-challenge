package challenges.reverse;

import static org.assertj.core.api.Assertions.assertThat;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class ReversedListPropertiesTest {
  @Property public void test(List<Integer> items) {
    assertThat(reversed(items)).isEqualTo(items);
  }

  private List<Integer> reversed(List<Integer> items) {
    var reversed = new ArrayList<>(items);
    Collections.reverse(reversed);
    return reversed;
  }
}
