package cross.xam.friendlybet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cross.xam.friendlybet.entity.Account;
import cross.xam.friendlybet.entity.Bet;
import cross.xam.friendlybet.entity.Participant;
import cross.xam.friendlybet.module.FriendlyBetModule;
import cross.xam.friendlybet.service.BetService;
import cross.xam.friendlybet.service.SimpleBetServiceImpl;
import dagger.ObjectGraph;


public class MainActivity extends AppCompatActivity {

    Button btnPlaceBet;
    EditText etBetTitle;
    EditText etBetWinCondition;
    EditText etBetAmount;
    TextView tvBetTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectGraph objectGraph = ObjectGraph.create(new FriendlyBetModule());
        BetService betService = objectGraph.get(SimpleBetServiceImpl.class);

        betService.getById(2l);

        initializeViews();

        Participant harry = new Participant();
        Participant lloyd = new Participant();
        harry.setAccount(new Account());
        lloyd.setAccount(new Account());
        harry.getAccount().deposit(300.0);
        lloyd.getAccount().deposit(200.0);
        harry.getAccount().withdraw(400.0);
        harry.getAccount().withdraw(100.0);
        System.out.println(lloyd.getAccount().transferToAccount(harry.getAccount(), 250.0));
        System.out.println(lloyd.getAccount().transferToAccount(harry.getAccount(), 100.0));
    }

    private void initializeViews(){
        btnPlaceBet = (Button) findViewById(R.id.btnPlaceBet);
        etBetTitle = (EditText) findViewById(R.id.etBetTitle);
        etBetWinCondition = (EditText) findViewById(R.id.etBetWinCondition);
        etBetAmount = (EditText) findViewById(R.id.etBetAmount);
        tvBetTitle = (TextView) findViewById(R.id.tvBetTitle);

        assignListeners();
    }

    private void assignListeners(){
        btnPlaceBet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bet newBet = new Bet();
                newBet.setTitle(etBetTitle.getText().toString());
                newBet.setWinCondition(etBetWinCondition.getText().toString());
                newBet.setAmount(Double.valueOf(etBetAmount.getText().toString()));
                tvBetTitle.setText(newBet.getTitle());
            }
        });
    }
}
