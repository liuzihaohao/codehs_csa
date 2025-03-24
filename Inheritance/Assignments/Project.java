public class Project extends Assignment {
    
    private boolean groups;
private boolean presentation;
public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation){
    super(name,dueDate,availablePoints,earnedPoints);
    this.groups=hasGroups;
    this.presentation=hasPresentation;
}

public boolean hasGroups(){
    return groups;
}
public boolean hasPresentation(){
    return presentation;
}

public void setGroups(boolean a){
    groups=a;
}
public void setPresentation(boolean a){
    presentation=a;
}
}