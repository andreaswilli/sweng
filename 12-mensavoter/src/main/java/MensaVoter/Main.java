package MensaVoter;

import static spark.Spark.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static TemplatingEngine te = new TemplatingEngine("/MensaVoter");

    public static void main(String[] args) {
        MenuManager mm = new MenuManager();
        mm.loadMenus("20181120");

        get("/menucount", (req, res) -> mm.getMenuCount());

        get("/menu/:no/likes",(req, res) -> mm.getMenu(Integer.parseInt(req.params("no"))).getLikes());
        post("/menu/:no/likes",(req, res) -> {
            mm.getMenu(Integer.parseInt(req.params("no"))).like();
            return "done";
        });

        get("/menu/:no/comments", (req, res) -> mm.getMenu(Integer.parseInt(req.params("no"))).getComments());
        post("/menu/:no/comments", (req, res) -> {
            mm.getMenu(Integer.parseInt(req.params("no"))).addComment(req.queryParams("comment"));
            return "done";
        });

        get("/", (req, res) -> getMenus(mm));
    }

    static String getMenus(MenuManager mm) {
        ArrayList<Menu> menus = new ArrayList<>();
        for (int i = 0; i < mm.getMenuCount(); i++) {
            menus.add(mm.getMenu(i));
        }
        HashMap<String, Object> data = new HashMap<>();
        data.put("menus", menus);
        return te.renderTemplate("today.ftl", data);
    }
}