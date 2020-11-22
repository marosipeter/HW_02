package HW_03;

public enum Level {

        FIRST("Junior", "Freshman"),
        SECOND("Mid-level","Sophomore"),
        THIRD("Senior","Junior"),
        FORTH("Expert", "Senior");

        private final String nameJob;
        private final String nameStudy;

    Level(String nameJob, String nameStudy) {
        this.nameJob = nameJob;
        this.nameStudy = nameStudy;
    }

    public String getNameJob() {
        return nameJob;
    }

    public String getNameStudy() {
        return nameStudy;
    }



}
