package com.uawebchallenge.bomberman.api;

import lombok.Value;

@Value
public class NewGameResponse {
    private final String gameId;
    private final String playerId;
}