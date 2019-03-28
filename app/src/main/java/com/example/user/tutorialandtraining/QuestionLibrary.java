package com.example.user.tutorialandtraining;


public class QuestionLibrary {

    private String mQuestions [] ={
            " Package of software that facilitate modeling of database and improved performance of database system is classified as",
            "Parts of an operation or function must includes",
            "Name of operation and type of data of parameters must be included in",
            "Function which causes retrieval of any kind of data from database is considered as",
            "Type of diagram in which operations are specified on objects is considered as",
            " Considering binary relationships, possible cardinality ratios are",
            "Attributes that can be arranged into hierarchy are called",
            "Set of all entities having same attributes is classified as",
            "Set of values which specifies which values are to be assigned to individual entities is considered as",
            "end question...press QUIT."
    };
    private String mChoices [][]={
            { "tools","programmers","system tools"},
            { "interface","implementation","tools"},
            { "logical signature","conceptual signature","interface or signature"},
            {"key","query","storing cycle"},
            {"class diagrams","entity diagrams","functional diagrams"},
            {"one : one","M : N","all of above"},
            {"composite attributes","atomic attributes","derived attributes"},
            { "function type","attribute type","entity type"},
            { "composition of values","domain of values","attribution of values"},
            { "press quit","press quit","press quit"}
    };
    private String mCorrectAnswer[]={"tools","implementation","interface or signature","query","class diagrams","all of above","composite attributes","entity type","domain of values","press quit"};

    public String getQuestion(int a)
    {
        String question=mQuestions[a];
        return question;

    }

    public String getChoice1(int a)
    {
        String Choice0=mChoices[a][0];
        return Choice0;
    }
    public String getChoice2(int a)
    {
        String Choice1=mChoices[a][1];
        return Choice1;
    }
    public String getChoice3(int a)
    {
        String Choice2=mChoices[a][2];
        return Choice2;
    }
    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswer[a];
        return answer;
    }
}
