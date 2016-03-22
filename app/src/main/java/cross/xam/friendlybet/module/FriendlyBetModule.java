package cross.xam.friendlybet.module;

import cross.xam.friendlybet.repository.BetRepository;
import cross.xam.friendlybet.repository.SimpleBetRepositoryImpl;
import cross.xam.friendlybet.service.SimpleBetServiceImpl;
import dagger.Module;
import dagger.Provides;

/**
 * Created by dmytro_korniienko on 3/14/16.
 */
@Module(injects = SimpleBetServiceImpl.class)
public class FriendlyBetModule {

    @Provides
    BetRepository provideBetRepository(){
        return new SimpleBetRepositoryImpl();
    }



}
