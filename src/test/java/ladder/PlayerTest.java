package ladder;

import ladder.domain.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PlayerTest {
    @Test
    @DisplayName("Player 클래스 생성 테스트")
    void Given_Names_When_New_Then_InstanceCreated() {
        List<String> playerNames = Arrays.asList("a", "b", "c", "d", "e");

        assertDoesNotThrow(() -> {
            new Player(playerNames);
        });
    }

    @Test
    void Given_LongName_When_New_Then_Exception() {
        List<String> playerNames = Arrays.asList("6chars");

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Player(playerNames));
    }

    @Test
    void When_Count_Then_NumberOfPlayers() {
        List<String> playerNames = Arrays.asList("a", "b", "c", "d", "e");

        Player player = new Player(playerNames);

        assertThat(player.count()).isEqualTo(playerNames.size());
    }
}
