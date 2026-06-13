package Workspace_project;

import java.util.*;

public class CoworkingSpace {

    private final String name;
    private final List<Workspace> workspaces;
    private final List<Booking> bookings;

    public CoworkingSpace(String name){
        this.name = name;
        workspaces = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    public List<Booking> getBookings() {
        return bookings;
    }


    public void addWorkspace(Workspace workspace){
        workspaces.add(workspace);
    }

    public Workspace findWorkspaceById(int id){
        for (Workspace workspace : workspaces) {
            if (workspace.getId() == id) return workspace;
        }
        return null;
    }
}
