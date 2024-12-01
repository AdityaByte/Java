package com.journalapp.service;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import com.journalapp.model.User;

public class UserArgumentsProvider implements ArgumentsProvider{
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext arg0) throws Exception {
        return Stream.of(
            Arguments.of(User.builder().userName("aditya123").password("aditya123").build()),
            Arguments.of(User.builder().userName("abhinav").password("").build())
        );
    }
}
