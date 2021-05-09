package by.epamtc.jwd.task2.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task2.service.CorrectionService;

public class RegexLogic implements CorrectionService {
    @Override
    public String correctLetter(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        String resultedText = text.replaceAll("PA(\\w)", "PO$1");
        return resultedText.replaceAll("PA(\\w)", "PO$1");
    }
}
