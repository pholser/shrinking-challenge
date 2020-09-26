package challenges.distinct;

import static org.assertj.core.api.Assertions.assertThat;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import java.util.HashSet;
import java.util.List;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class DistinctElementsOfListPropertiesTest {
  @Property public void testListHasFewDistinct(List<Integer> items) {
    assertThat(new HashSet<>(items)).hasSizeLessThan(3);
  }
}
