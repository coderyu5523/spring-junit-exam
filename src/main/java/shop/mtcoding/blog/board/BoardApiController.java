package shop.mtcoding.blog.board;


import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardApiController {
    private final BoardRepository boardRepository;

    @GetMapping("/api/boards")
    public ApiUtil<?> findAll(){

        List<Board> boardList = boardRepository.selectAll();
        return new ApiUtil<>(boardList);

    }

}
