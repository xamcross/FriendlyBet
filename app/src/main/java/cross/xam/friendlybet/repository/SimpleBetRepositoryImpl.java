package cross.xam.friendlybet.repository;

import java.util.ArrayList;
import java.util.List;

import cross.xam.friendlybet.entity.Bet;
import cross.xam.friendlybet.entity.Participant;

/**
 * Created by dmytro_korniienko on 3/14/16.
 */
public class SimpleBetRepositoryImpl implements BetRepository {

    private List<Bet> allBets = new ArrayList<>();

    @Override
    public Bet getById(Long id) {
        return null;
    }

    @Override
    public List<Bet> getAllForParticipant(Participant participant) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public Long placeBet(Bet bet) {
        if(bet != null) {
            allBets.add(bet);
            return bet.getId();
        }
        return null;
    }
}
