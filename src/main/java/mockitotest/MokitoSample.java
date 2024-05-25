package mockitotest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoSampleTest {

    // フィールドは省略

 @Test
 @DisplayName("getSquareResultに5を渡したときに25が表示できる")
 void test() {
  when(calc.square(5)).thenReturn(25);
  String result = sample.getSquareResult(5);

  // 3. 実行結果の実測値と期待値の検証（アサーション）を行う
  assertEquals(result, "5の二乗の結果は25");
 }
}