package quote;

/**
 * Created by 152658F on 12/1/2016.
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteDAO {
    private static List<Quote> quotes;
    private static Random random = new Random();



    public QuoteDAO() {
        if (quotes == null) {
            quotes = new ArrayList<Quote>();
            quotes.add(new Quote("Donald Trump", "Sometimes by losing a battle you find a new way to win the war."));
            quotes.add(new Quote("Donald Trump", "You have to think anyway, so why not think big?"));
            quotes.add(new Quote("Donald Trump", "Without passion you don't have energy, without energy you have nothing."));
            quotes.add(new Quote("Confucius", "It does not matter how slowly you go as long as you do not stop"));
            quotes.add(new Quote("Confucius", "Life is really simple, but we insist on making it complicated"));
            quotes.add(new Quote("Confucius", "Wherever you go, go with all your heart."));
            quotes.add(new Quote("Confucius", "Silence is a true friend who never betrays."));
            quotes.add(new Quote("Aristotle", "Quality is not an act, it is a habit."));
            quotes.add(new Quote("Aristotle", "The roots of education are bitter, but the fruit is sweet."));
            quotes.add(new Quote("Albert Einstein", "The true sign of intelligence is not knowledge but imagination."));
        }
    }

    public Quote getRandomQuote() {

        System.out.println("Quote size : " + quotes.size());
        return quotes.get(random.nextInt(quotes.size()));
    }


    public List<Quote> getQuotes(String author) {
        List<Quote> list = new ArrayList<Quote>();
        for (Quote q : list) {
            if (q.getAuthor().equals(author)) {
                list.add(q);
            }
        }
        return list;
    }

    public void addQuote(Quote q) {
        quotes.add(q);
    }

}
