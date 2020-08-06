package request;

import model.DairyUser;

import java.time.LocalDate;

public class CreateDairyEntryRequest {
    private long id;
    private String entrySubject;
    private String entryText;
    private LocalDate entryDate;
    private DairyUser dairyUserEntity;

    public CreateDairyEntryRequest(String entrySubject, String entryText, LocalDate entryDate, DairyUser dairyUserEntity) {
        this.entrySubject = entrySubject;
        this.entryText = entryText;
        this.entryDate = entryDate;
        this.dairyUserEntity = dairyUserEntity;
    }

    public CreateDairyEntryRequest() {
    }
}
