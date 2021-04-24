package by.epamtc.task4.logic;

import by.epamtc.exeptions.NullStringException;
import by.epamtc.task4.service.DeleteService;

public class RegexLogic implements DeleteService {
    @Override
    public String deleteNonLetters(String text) throws NullStringException {
        if (text == null) throw new NullStringException("String is not initialized");

        return text.replaceAll("([^А-Яа-яA-Za-z ])", "");
    }
}
