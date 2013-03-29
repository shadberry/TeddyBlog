package net.teddy.control.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;
import net.teddy.service.impl.UserService;
import net.teddy.utils.CommonUtil;

public class ArticleAction {
	
	private static ArticleService  articleService = new ArticleService(); 
	private static UserService userService = new UserService();
	
	/**
	 * Show specify article
	 * @return
	 * @throws Exception
	 */
	public String show() throws Exception {
		if (id != null && id > 0) {
			article = articleService.findById(id);
			article.setReadcount((article.getReadcount() == null ? 0 :  article.getReadcount()) + 1 );
			articleContent = CommonUtil.convertBlobToString(article.getContent());
			userName = UserService.HOST_MAP.get(article.getCreatorId());
			return userName+"success";
		} else {
			return "error";
		}
	}
	
	/**
	 * Show write article page
	 * @return
	 * @throws Exception
	 */
	public String write() throws Exception {
		userName = UserService.HOST_MAP.get(userId);
		return userName+"success";
	}
	
	/**
	 * Save article and show it
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception {
		userName = UserService.HOST_MAP.get(userId);
		String[] tagArray = articleTags.trim().split(" ");
		List<String> tagList = new ArrayList<String>();
		if (tagArray != null && tagArray.length > 0) {
			for (String tag : tagArray) {
				if (!tag.trim().isEmpty()) {
					tagList.add(tag);
				}
			}
		}
		this.id = articleService.saveArticleInfo(userId, articleTitle, articleContent, tagList);
		return "saved";
	}
	
	/**
	 * Show edit article page
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		if (id != null && id > 0) {
			article = articleService.findById(id);
			articleContent = CommonUtil.convertBlobToString(article.getContent());
			
			userName = UserService.HOST_MAP.get(article.getCreatorId());
			userId = article.getCreatorId();
			return userName+"success";
		} else {
			return "error";
		}
	}
	/**
	 * Save article and show it after modify it
	 * @return
	 * @throws Exception
	 */
	public String saveEdit() throws Exception {
		userName = UserService.HOST_MAP.get(userId);
		
		String[] tagArray = articleTags.trim().split(" ");
		List<String> tagList = new ArrayList<String>();
		if (tagArray != null && tagArray.length > 0) {
			for (String tag : tagArray) {
				if (!tag.trim().isEmpty()) {
					tagList.add(tag);
				}
			}
		}
		System.out.println("@@@ id is " + id);
		articleService.saveArticleInfo(id, userId, articleTitle, articleContent, tagList);
		return "saved";
	}
//	/**
//	 * Show specify article
//	 * @return
//	 * @throws Exception
//	 */
//	public String showTeddy() throws Exception {
//		if (id != null && id > 0) {
//			article.setReadcount(article.getReadcount() + 1 );
//			article = articleService.findById(id);
//			articleContent = CommonUtil.convertBlobToString(article.getContent());
//		}
//		return "success";
//	}
//	
//	/**
//	 * Show write Teddy's article page
//	 * @return
//	 * @throws Exception
//	 */
//	public String writeTeddy() throws Exception {
//		return "success";
//	}
//	
//	/**
//	 * Save Teddy's article and show it
//	 * @return
//	 * @throws Exception
//	 */
//	public String saveTeddy() throws Exception {
//		this.id = articleService.saveArticleInfo(1, articleTitle, articleContent, new ArrayList<String>());
//		return "saved";
//	}
//	
//	/**
//	 * Show edit Teddy's article page
//	 * @return
//	 * @throws Exception
//	 */
//	public String editTeddy() throws Exception {
//		if (id != null && id > 0) {
//			article = articleService.findById(id);
//			articleContent = CommonUtil.convertBlobToString(article.getContent());
//		}
//		return "success";
//	}
//	/**
//	 * Save Teddy's article and show it after modify it
//	 * @return
//	 * @throws Exception
//	 */
//	public String saveEditTeddy() throws Exception {
//		articleService.saveArticleInfo(id, 1, articleTitle, articleContent, new ArrayList<String>());
//		return "saved";
//	}
	
//	/**
//	 * Show specify article
//	 * @return
//	 * @throws Exception
//	 */
//	public String showShall() throws Exception {
//		if (id != null && id > 0) {
//			article.setReadcount(article.getReadcount() + 1 );
//			article = articleService.findById(id);
//			articleContent = CommonUtil.convertBlobToString(article.getContent());
//		}
//		return "success";
//	}
//	
//	public String writeShall() throws Exception {
//		return "success";
//	}
//	
//	/**
//	 * Save Teddy's article and show it
//	 * @return
//	 * @throws Exception
//	 */
//	public String saveShall() throws Exception {
//		this.id = articleService.saveArticleInfo(2, articleTitle, articleContent, new ArrayList<String>());
//		return "saved";
//	}
//	
//	/**
//	 * Show edit Teddy's article page
//	 * @return
//	 * @throws Exception
//	 */
//	public String editShall() throws Exception {
//		if (id != null && id > 0) {
//			article = articleService.findById(id);
//			articleContent = CommonUtil.convertBlobToString(article.getContent());
//		}
//		return "success";
//	}
//	/**
//	 * Save Teddy's article and show it after modify it
//	 * @return
//	 * @throws Exception
//	 */
//	public String saveEditShall() throws Exception {
//		articleService.saveArticleInfo(id, 2, articleTitle, articleContent, new ArrayList<String>());
//		return "saved";
//	}

	/*******************************Arguments***************************************/
	//in|out: owner id
	private Integer userId;
	//out:owner name
	private String userName;
	
	//in|out: article id
	private Integer id;
	//out: article info
	private TArticle article;

	//in:articleTitle
	private String articleTitle;
	//in|out:articleContent
	private String articleContent;
	//in:out:articleTags;
	private String articleTags;

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public TArticle getArticle() {
		return article;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer ownerId) {
		this.userId = ownerId;
	}

	public String getUserName() {
		return userName;
	}

	public String getArticleTags() {
		return articleTags;
	}

	public void setArticleTags(String articleTags) {
		this.articleTags = articleTags;
	}
	
}
