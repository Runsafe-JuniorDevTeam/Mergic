package no.runsafe.mergic.magic.spells;

import no.runsafe.framework.api.IServer;
import no.runsafe.framework.minecraft.Item;
import no.runsafe.mergic.KillManager;
import no.runsafe.mergic.magic.MagicSchool;

public class FireStorm extends Storm
{
	public FireStorm(IServer server, KillManager manager)
	{
		super(server, Item.Unavailable.StationaryLava, manager);
	}

	@Override
	public String getName()
	{
		return "Fire Storm";
	}

	@Override
	public MagicSchool getSchool()
	{
		return MagicSchool.FIRE;
	}
}
