class Hello 
{
	public static void main(String[] args) 
	{
		MemberDAO dao=new MemberDAO();
		dao.insert();
		dao.update();

		DeptDAO ddao=new DeptDAO();
		ddao.insert();
		ddao.update();
	}
}
