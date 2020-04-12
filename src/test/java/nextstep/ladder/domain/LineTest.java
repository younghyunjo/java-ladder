package nextstep.ladder.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {
    private Line line;

    @BeforeEach
    void setUp() {
        line = new Line();
    }

    @DisplayName("사람의 수보다는 하나 적게 포인트를 만든다.")
    @Test
    void createLine() {
        List<Point> points = line.createPoints(5);
        assertThat(points).hasSize(4);
    }

}