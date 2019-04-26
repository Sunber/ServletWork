import com.revature.beans.Move;

public class Polkaman {

	private int id;
	private String name;
	private int str;
	private int hp;
	private Move move;
	
	public Polkaman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Polkaman(int id, String name, int str, int hp, Move move) {
		super();
		this.id = id;
		this.name = name;
		this.str = str;
		this.hp = hp;
		this.move = move;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public Move getMove() {
		return this.move;
	}
	
	public void setMove(Move move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return "Polkaman [id=" + id + ", name=" + name + ", str=" + str + ", hp=" + hp + ", move=" + move + "]";
	}
	
}
