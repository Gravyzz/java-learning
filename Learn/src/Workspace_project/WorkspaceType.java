package Workspace_project;

public enum WorkspaceType {

    DESK("Рабочий стол", 100),
    MEETING_ROOM("Переговорная", 500),
    PHONE_BOOTH("Телефонная будка", 200);

    private final String description;
    private final double pricePerHour;

    WorkspaceType(String description, double pricePerHour){
        this.description = description;
        this.pricePerHour = pricePerHour;
    }

    public String getDescription() {
        return description;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }
}
