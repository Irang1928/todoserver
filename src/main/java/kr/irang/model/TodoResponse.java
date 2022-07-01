package kr.irang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponse {

    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoEntity todoEntity) {
        this.id = todoEntity.getId();
        this.title = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();

        /* url이나 port가 변경되는 경우 코드를 수정해야 하는 번거로움 때문에, 보통은 config나 properties를 통해 관리해야 하지만
        이 프로젝트는 간단한 To do list를 만드는 것이 목적이기 때문에 작업을 늘리지 않고 url을 코드 내에 정의해주었다. */
        this.url = "http://localhost:8080/" + this.id;
    }
}
