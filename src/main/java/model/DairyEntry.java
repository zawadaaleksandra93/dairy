package model;


import java.time.LocalDate;

public class DairyEntry {
    private long id;
    private String entrySubject;
    private String entryText;
    private LocalDate entryDate;
    private DairyUser dairyUserEntity;

    public DairyEntry( String entrySubject, String entryText, LocalDate entryDate, DairyUser dairyUserEntity) {

        this.entrySubject = entrySubject;
        this.entryText = entryText;
        this.entryDate = entryDate;
        this.dairyUserEntity = dairyUserEntity;
    }

    public DairyEntry() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEntrySubject() {
        return entrySubject;
    }

    public void setEntrySubject(String entrySubject) {
        this.entrySubject = entrySubject;
    }

    public String getEntryText() {
        return entryText;
    }

    public void setEntryText(String entryText) {
        this.entryText = entryText;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public DairyUser getDairyUserEntity() {
        return dairyUserEntity;
    }

    public void setDairyUserEntity(DairyUser dairyUserEntity) {
        this.dairyUserEntity = dairyUserEntity;
    }

    @Override
    public String toString() {
        return "DairyEntry{" +
                "entrySubject='" + entrySubject + '\'' +
                ", entryText='" + entryText + '\'' +
                '}';
    }
}
