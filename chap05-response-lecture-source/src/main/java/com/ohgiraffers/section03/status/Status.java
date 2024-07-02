package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 200, 400, 401, 404, 500

        response.sendError(404, "없는 페이지입니다. 경로를 확인해주세요");
        response.sendError(200, "요청하신 작업이 성공하였습니다.");
        response.sendError(400, "문법이 잘못되어 서버가 요청을 이해할 수 없습니다.");
        response.sendError(401, "인증이 되지 않았습니다. 인증 후 진행해주세요");
        response.sendError(404, "서버는 요청받은 리소스를 찾을 수 없습니다. 경로 등을 확인해주세요");
        response.sendError(500, "서버에서 요청하신 처리 방법을 알지 못합니다. 수정하여 다시 진행해주세요.");

    }
}
