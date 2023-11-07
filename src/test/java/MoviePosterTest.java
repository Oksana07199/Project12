import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.MoviePoster;

public class MoviePosterTest {
    @Test
    public void AddZeroFilms() {
        MoviePoster manager = new MoviePoster();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testAddOneFilm() { //доп фильм
        MoviePoster manager = new MoviePoster();

        manager.add("Film 1");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testAddSeveralFilms() { // неск-ко фильмов
        MoviePoster manager = new MoviePoster();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testLastLessLimit() {  //беск-ый предел
        MoviePoster manager = new MoviePoster();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");

        String[] actual = manager.findLast();
        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastLimitAmount() { //послед.пред.зн-ие
        MoviePoster manager = new MoviePoster();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");

        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastOverLimit() {
        MoviePoster manager = new MoviePoster();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");

        String[] actual = manager.findLast();
        String[] expected = { "Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
