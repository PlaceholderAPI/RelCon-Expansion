# RelCon-Expansion
This is a [PlaceholderAPI](http://placeholderapi.com/) expansion that allows you to display "hidden" text for players with a specific
permission you set in the placeholder itself.
It only provide relation placeholders, so the plugin you'll use them in should be supporting relation placeholders from PlaceholderAPI.

## Placeholders

Theres one placeholder only (So far, if you have any suggestion please let me know by opening a new issue [here](https://github.com/aBo0oDyy/RelCon-Expansion/issues))
that can be used for different values.

### `%rel_relcon_<permission>_<text1>_[text2]%`
<br />

> #### `<permission>`
The premission that the seconed player should have to be able to see the text you set. <br />
Supports any PlaceholderAPI placeholder to be used here, but the placeholder should be inside `{}` instead of `%%`. (**Required field**)
<br />
<br />

> #### `<text1>`
The text that will be displayed if the second player has the permission. <br />
Supports any PlaceholderAPI placeholder to be used here, but the placeholder should be inside `{}` instead of `%%`
it also supports new lines, just add `{nl}` to add a new line. (**Required field**)
<br />
<br />

> #### `[text2]`
The text that will be displayed if the second player doesn't have the permission. <br />
Supports any PlaceholderAPI placeholder to be used here, but the placeholder should be inside `{}` instead of `%%` 
it also supports new lines, just add `{nl}` to add a new line.
If no value is set, it will return the value in PlaceholderAPI config file.
> 
> Default value: `&cYou don't have permission to see this`

## Example
This expansion is made specificly to add hidden tooltips for [DeluxeChat](https://www.spigotmc.org/resources/1277/) plugin but as mentioned above, it will work with
any plugin that supports relation placeholders. <br />
Eaxmple of use in DeluxeChat:
```yml
%rel_relcon_tooltip.staff_{nl}&8&l&m                  {nl}&6&lJailed &8&l» &7{essentials_jailed}_ %
```
![GIF for what it will return in-game](https://img.aboodyy.net/RelConExpansion.gif)

# Download
You can download this expansion automatically using PAPI download commands:

> ```
> /papi ecloud download RelCon
> /papi reload
> ```

Or you can download it manaually from the [eCloud](https://api.extendedclip.com/expansions/relcon/) and then put it in the `expansions` folder (Path: `/plugins/PlaceholderAPI/expansions/`)
