package by.epamtc.jwd.task4.logic;

import by.epamtc.jwd.exeptions.NullStringException;
import by.epamtc.jwd.task4.service.DeleteService;

public class RegexLogic implements DeleteService {
    @Override
    public String deleteNonLetters(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        return text.replaceAll("([^А-Яа-яA-Za-z ])", "");
    }
}
