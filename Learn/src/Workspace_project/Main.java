package Workspace_project;

public class Main {
    public static void main(String[] args) {

        CoworkingSpace coworking = new CoworkingSpace("Рога и Копыта");


        coworking.addWorkspace(new Workspace(10, WorkspaceType.DESK));
        coworking.addWorkspace(new Workspace(5, WorkspaceType.MEETING_ROOM));
        coworking.addWorkspace(new Workspace(20, WorkspaceType.PHONE_BOOTH));

        System.out.println(coworking.getWorkspaces().size());      // 3
        System.out.println(coworking.findWorkspaceById(5));        // должна быть ПЕРЕГОВОРНАЯ (id=5)
        System.out.println(coworking.findWorkspaceById(20));       // ТЕЛЕФОННАЯ БУДКА (id=20)
        System.out.println(coworking.findWorkspaceById(10));       // РАБОЧИЙ СТОЛ (id=10)
        System.out.println(coworking.findWorkspaceById(99));       // null
    }
}
