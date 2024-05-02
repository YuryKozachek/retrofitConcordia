package modelsPoJoPage;

import java.util.ArrayList;

public class CardListRoodResponse {
    public ArrayList<CardListResponse> cards;

    public CardListRoodResponse(ArrayList<CardListResponse> cards) {
        this.cards = cards;
    }

    public ArrayList<CardListResponse> getCards() {
        return cards;
    }

    public void setCards(ArrayList<CardListResponse> cards) {
        this.cards = cards;
    }
}
