import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    String id;
    String text;
    String type;
    String user;
    String upvotes;

    public Cat(

            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes) {

        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Кот" +
                "\n Id: " + id + "," +
                "\n Факт: " + text +
                "\n Тип животного: " + type + "," +
                "\n Пользователь: " + user + "," +
                "\n Проголосовало: " + upvotes + "голосующих"+"\n";

    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }
}
