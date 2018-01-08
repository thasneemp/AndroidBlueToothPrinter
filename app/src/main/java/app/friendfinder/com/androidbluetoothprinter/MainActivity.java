package app.friendfinder.com.androidbluetoothprinter;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothPrinter bluetoothPrinter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();


        Set<BluetoothDevice> bondedDevices = mBluetoothAdapter.getBondedDevices();

        bluetoothPrinter = new BluetoothPrinter(bondedDevices.iterator().next());

        bluetoothPrinter.connectPrinter(new BluetoothPrinter.PrinterConnectListener() {
            @Override
            public void onConnected() {
                bluetoothPrinter.printText("           ==ORDER BILL==    ");
                bluetoothPrinter.feedPaper(1);
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("            POS DEMO SHOP  ");
                bluetoothPrinter.addNewLine();
//                bluetoothPrinter.setBold(false);

                bluetoothPrinter.printText("Kadavanthra ernakulam");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("            0487-8989894343  ");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("              TIN : NA");
                bluetoothPrinter.feedPaper(1);
                bluetoothPrinter.printText("Bill no : 12333443");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Date :01/08/2017   Time:01:12PM");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Ctr: cash");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Wtr : mhd            Tab : S2");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printLine();

                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("ITEM NAME     QTY  RATE   AMOUNT");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printLine();
                bluetoothPrinter.printText("Sweet Lassi    2    30       60");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Sweet Lassi    2    30       60");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Sweet Lassi    2    30       60");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Sweet Lassi    2    30       60");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Sweet Lassi    2    30       60");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Sweet Lassi    2    30       60");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printLine();
                bluetoothPrinter.printText("Total :                      380");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Discount :                    80");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("Total payable : 12      300.00");


                bluetoothPrinter.feedPaper(2);

                bluetoothPrinter.printLine();
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("www.demoshop.com");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("0484-32423423423");
                bluetoothPrinter.printText("                 Thank you");

                bluetoothPrinter.addNewLine();
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("                                ");
                bluetoothPrinter.addNewLine();
                bluetoothPrinter.printText("                                ");
            }

            @Override
            public void onFailed() {

            }
        });
    }

    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
