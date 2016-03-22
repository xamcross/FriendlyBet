package cross.xam.friendlybet.service;

import java.util.List;

import cross.xam.friendlybet.entity.Bet;
import cross.xam.friendlybet.entity.Participant;
import cross.xam.friendlybet.repository.BetRepository;
import javax.inject.Inject;

/**
 * Created by dmytro_korniienko on 3/14/16.
 */
public class SimpleBetServiceImpl implements BetService {

    @Inject
    BetRepository betRepository;

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
        betRepository.placeBet(bet);
        return bet.getId();
    }
}
