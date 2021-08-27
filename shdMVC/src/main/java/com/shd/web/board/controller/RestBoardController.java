package com.shd.web.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shd.web.board.model.ReplyVO;
import com.shd.web.board.service.BoardService;

@RestController
@RequestMapping(value = "/restBoard")
public class RestBoardController {

	@Inject
	private BoardService boardService;

	@RequestMapping(value = "/getReplyList", method = { RequestMethod.GET, RequestMethod.POST })
	public List<ReplyVO> getReplyList(@RequestParam("bid") int bid) throws Exception {

		return boardService.getReplyList(bid);

	}

	/** 댓글 쓰기 추가 메서드 */
	@RequestMapping(value = "/saveReply", method = { RequestMethod.GET, RequestMethod.POST })
	public Map<String, Object> saveReply(@RequestBody ReplyVO replyVO) throws Exception {

		Map<String, Object> result = new HashMap<>();

		try {

			boardService.saveReply(replyVO);

			result.put("status", "OK");

		} catch (Exception e) {

			e.printStackTrace();

			result.put("status", "False");

		}

		return result;

	}

	@RequestMapping(value = "/updateReply", method = { RequestMethod.GET, RequestMethod.POST })

	public Map<String, Object> updateReply(@RequestBody ReplyVO replyVO) throws Exception {

		Map<String, Object> result = new HashMap<>();
		try {
			boardService.updateReply(replyVO);
			result.put("status", "OK");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "False");
		}
		return result;
	}

	@RequestMapping(value = "/deleteReply", method = { RequestMethod.GET, RequestMethod.POST })

	public Map<String, Object> deleteReply(@RequestParam("rid") int rid) throws Exception {

		Map<String, Object> result = new HashMap<>();
		try {
			boardService.deleteReply(rid);
			result.put("status", "OK");

		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "False");
		}
		return result;
	}

}