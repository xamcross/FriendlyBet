package cross.xam.friendlybet.service;

import java.util.List;

import cross.xam.friendlybet.entity.Bet;
import cross.xam.friendlybet.entity.Participant;

/**
 * Created by dmytro_korniienko on 3/14/16.
 */
public interface BetService {

    public Bet getById(Long id);

    public List<Bet> getAllForParticipant(Participant participant);

    public void removeById(Long id);

    public Long placeBet(Bet bet);
}
