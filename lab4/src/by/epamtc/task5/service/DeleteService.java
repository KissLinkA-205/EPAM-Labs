package by.epamtc.task5.service;

import by.epamtc.exeptions.NullStringException;

public interface DeleteService {
    String deleteConsonantWords(String text, int length) throws NullStringException;
}
