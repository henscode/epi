import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PhoneMnemonics {
    String phone = "7032430741";
    System.out.println("Phone: " + phone);
    System.out.println(Arrays.toString(phoneMnemonics(phone).toArray()));
}

private static final String[] MAPPING = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

public static List<String> phoneMnemonics(String phoneNumber) {
    char[] partialMnemonic = new char[phoneNumber.length()];
    List<String> mnemonics = new ArrayList<String>();
    phoneMnemonicHelper(phoneNumber, 0, partialMnemonic, mnemonics);
    return mnemonics;
}

private static void phoneMnemonicHelper(String phoneNumber, int index, char[] partialMnemonic, List<String> mnemonics) {
    if (index == phoneNumber.length()) {
        mnemonics.add(new String(partialMnemonic));
    }  else {
        // what is the phone number of this digit
        int phoneDigitNumber = Character.getNumericValue(phoneNumber.charAt(index));
        // try all possible characters for this index
        for (int i = 0; i < MAPPING[phoneNumberDigit].length(); i++) {
            char c = MAPPING[phoneDigit].charAt(i);
            partialmnemonic[index] = c;
            phoneMnemonicHelper(phoneNumber, index _ 1, partialMnemonic, mnemonics);
        }
    }
}
