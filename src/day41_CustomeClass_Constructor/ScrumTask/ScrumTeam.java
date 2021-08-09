package day41_CustomeClass_Constructor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO;
    public String BA;
    public String SM;
    public ArrayList<Tester>testers;
    public ArrayList<Tester>developers;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers= new ArrayList<>();
        developers= new ArrayList<>();
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO= '" + PO + '\'' +
                ", BA= '" + BA + '\'' +
                ", SM= '" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ",  number of developers=" + developers.size() +
                '}';
    }


   public void hireTester(Tester tester){// hire just one tester
      testers.add(tester);
    }


    public void hireTesters(Tester[]testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf(tester ->tester.id==id);

    }
}


